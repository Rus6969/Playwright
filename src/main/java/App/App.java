package App;

import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("https://www.scaler.com/topics/frozenset-in-python/");
            //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            page.content();
            System.out.println(page.title());
        }
    }
}