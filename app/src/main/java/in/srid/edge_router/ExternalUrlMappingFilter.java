package in.srid.edge_router;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVICE_ID_KEY;

public class ExternalUrlMappingFilter extends ZuulFilter {
    private static final Logger LOG = LoggerFactory.getLogger(ExternalUrlMappingFilter.class);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        final RequestContext currentContext = RequestContext.getCurrentContext();
        final String requestURI = currentContext.getRequest().getRequestURI();
        LOG.info("Matched request uri [{}]", requestURI);
        currentContext.set(SERVICE_ID_KEY, "stub");

        return null;
    }
}
