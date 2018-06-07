package com.chanxi.view;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by ymind on 2018/6/7.
 */
public class ContextFreeMarkerView extends FreeMarkerView {
    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        super.exposeHelpers(model, request);

        model.put("base", request.getContextPath());
    }
}
