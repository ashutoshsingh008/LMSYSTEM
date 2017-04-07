
package com.lms.global;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public final class GlobalController {
    @ModelAttribute
    public void addAttributes(Model model) {
	   model.addAttribute("wmsg", "Welcome to Admin Panel");
    }
}
