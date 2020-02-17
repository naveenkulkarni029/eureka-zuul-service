package org.nbk.eureka.zuul.security.model;

import org.springframework.beans.factory.annotation.Value;

public class JwtConfig {

	@Value("${security.jwt.uri:/auth/**}")
	private String Uri;

	@Value("${security.jwt.header:Authorization}")
	private String header;

	@Value("${security.jwt.prefix:Bearer }")
	private String prefix;

	@Value("${security.jwt.expiration:#{24*60*60}}")
	private int expiration;

	@Value("${security.jwt.secret:JwtSecretKey}")
	private String secret;

	// In case you want to use plain getters instead of lombok.
	public String getUri() {
		return Uri;
	}

	public String getHeader() {
		return header;
	}

	public String getPrefix() {
		return prefix;
	}

	public int getExpiration() {
		return expiration;
	}

	public String getSecret() {
		return secret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JwtConfig [Uri=");
		builder.append(Uri);
		builder.append(", header=");
		builder.append(header);
		builder.append(", prefix=");
		builder.append(prefix);
		builder.append(", expiration=");
		builder.append(expiration);
		builder.append(", secret=");
		builder.append(secret);
		builder.append("]");
		return builder.toString();
	}

}
