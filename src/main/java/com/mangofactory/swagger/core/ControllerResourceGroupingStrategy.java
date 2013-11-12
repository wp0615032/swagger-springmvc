package com.mangofactory.swagger.core;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

public interface ControllerResourceGroupingStrategy {
   public String getControllerName(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
   public String getControllerGroup(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
   public String getControllerPath(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
}
