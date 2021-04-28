import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTvNetTest {
    // LOCATOR- адрес, указатель, указание какой web-элемент на сайте мы хотим найти. Является статичным объектом. ВСЕГДА прописываем вручную, а не копируем.
    // WebElement- объект содержащий в себе какой-либо элемент (указатель на кусок кода в html'е), его положение в DOM-дереве, работает пока мы находимся на текущей странице.
    //пишем локаторы здесь наверху
    private final By LOCATOR_BY_ID = By.id("elementId");
    //локатор по атрибуту ID элемента, это значит, что элемент один на странице
    // поиск по ID- всегда в приоритете
    // всегда ставим private для локаторов
    // final- константа (переменная, кот.никогда не меняется), т.к. локатор никогда не меняется, остается константой
    // LOCATOR_BY_ID - назв переменной (константы пишутся всегда капс локом with underscore)
    // если назв.id меняется при рефреше страницы, то не используем ее
    // "elementId" - содержимое переменной
    private final By LOCATOR_BY_NAME = By.name("elementName");
    // уникальный элемент, присущ формам- полям ввода
    // 1 name- 1 element
    private final By LOCATOR_BY_TAGNAME = By.tagName("nameOfTag");
    private final By LOCATOR_BY_CLASS = By.className("elementClassName");
    // если нет id, name, className, ищем по xpath
    //если надо работать со многими элементами

    // Xpath - универсальный путь до элемента, указывают путь до нужного элемента. 2 варианта пути - абсолютный и относительный.
    // Absolute: путь от первого тэга html--body--div и тд. пример -- /html/body/script[17] -- не стабильный путь, НЕ ИСПОЛЬЗУЕМ!!
    // Relative:
    //Xpath: начинается с .// - поиск с начала указанного элемента, а не по всему окну как при //
    // далее указываем тэг который ищем -- .//div ( или * - any tag) -- .//*[условие по кот.ищем,атрибут]
    // .//div[@class= 'list-article__meta-info flex flex--justify-content-start flex--align-items-center'] -- 1й вариант поиска- по полному совпадению
    // 2й вариант -- по частичному совпадению -- функция contains: .//*[contains(@class, 'list-article__meta-info flex ')]

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode='primary']");

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        // System- статичный объект, наша система,
        // setProperty - метод, прописать в систему параметр,
        // webdriver.chrome.driver- назв системной переменной(переменная нашей ОС), берем из поиска в гугле или док-ции, или из Stack trac'а
        // "c://chromedriver.exe" - путь загруженного драйвера
        WebDriver browserWindow = new ChromeDriver();
        //создание объекта- открытие браузерного окна, где new ChromeDriver- копия, а WebDriver- переменная.
        //WebDriver - окно браузера, может быть несколько, не статичный объект (имеет экземпляры)
        //статичные объекты- объект в единственном экземпляре, можно напрямую обращатся.
        browserWindow.manage().window().maximize();
        // расхлопнуть окно на весь экран
        browserWindow.get("http://tvnet.lv"); //переменная (browserWindow) + метод или функция (get) - перейти на сайт. Используя переменную, мы обращаемся к окну браузера
        //https - не указываем, т.к должен стоя ть редирект с http на https

        //Thread.sleep(10000); --никогда не используем

        //ОЖИДАНИЕ ЭЛЕМЕНТА
        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        //WebDriverWait объект ожидания. Создаем его экземпляр - new WebDriverWait, указываем в каком окне будет происходить ожидание (в данном примере- browserWindow)
        //timeOutInSeconds- максим кол-во времени в секундах, сколько мы будем ждать элемент

        //ОЖИДАНИЕ ДЛЯ Э-МЭЙЛОВ
        WebDriverWait mailWait = new WebDriverWait(browserWindow, 60, 2000); // sleepInMillis- проверка мэйла каждые 2 сек

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
        //Ожидание до, в скобках условия ожидания
        //ExpectedConditions- набор стандартных условий, ожидаемые условия.
        //presenceOfElementLocated- элемент будет показан, появится на странице
        // ACCEPT_COOKIES_BTN- элемент, который будет показан
        //elementToBeClickable- элемент станет кликабельным

        //WebElement acceptBtn = browserWindow.findElement(ACCEPT_COOKIES_BTN);
        //acceptBtn.click();
        //findElement - всегда возвращает 1 элемент и всегда 1-й по очереди.
        //findElements - возвращает список элементов, кот. соответствуют данному локатору.
        //WebElement - хранит в себе только указатель на конкретное место в DOM дереве, на другой странице эта переменная не будет актуальной


        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
    }

}
