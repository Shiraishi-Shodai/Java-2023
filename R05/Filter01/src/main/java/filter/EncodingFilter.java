package filter;

import java.io.IOException;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;

@WebFilter(dispatcherTypes = {
			DispatcherType.REQUEST,
			DispatcherType.FORWARD
	},
	initParams = {
			@WebInitParam(name = "encoding", value = "UTF-8")
	},
	urlPatterns = "/*"
)
/**
 * Servlet Filter implementation class EncodingFilter
 */
public class EncodingFilter extends HttpFilter {
       private String encoding = null;
    /**
     * @see HttpFilter#HttpFilter()
     */
    public EncodingFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding(this.encoding);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.encoding = fConfig.getInitParameter("encoding");
	}

}
