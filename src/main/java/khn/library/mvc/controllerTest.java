
package khn.library.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kathie Nguyen
 *
 */
@Controller
public class controllerTest {
	
		@RequestMapping("/helloControllertest")
		public String dispTestPage() {
			return "hello";
		}
}
