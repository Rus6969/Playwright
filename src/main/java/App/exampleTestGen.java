package App;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
public class exampleTestGen {



        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://www.wikipedia.org/");
                page.getByLabel("Search Wikipedia").click();
                page.getByLabel("Search Wikipedia").fill("Lebron James ");
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("LeBron James American basketball player (born 1984)")).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("NBA career statistics")).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("2020–21").setExact(true)).click();
                Page page1 = context.newPage();
                page1.navigate("https://www.google.com/search?q=vk&oq=vk&aqs=chrome..69i57.1259j0j1&sourceid=chrome&ie=UTF-8");
                page1.navigate("https://www.google.com/search?q=vk&oq=vk&aqs=chrome..69i57.1259j0j1&sourceid=chrome&ie=UTF-8#bsht=CgRmYnNtEgQIBDAB");
            }
        }
    }

