package com.ram.monolithToMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECommerceController {

	@GetMapping("/monolithApp")
	public String getApp() {
		return "Life is full of beautiful moments that deserve to be cherished and celebrated. "
				+ "From the warm glow of the morning sun to the breathtaking colors of a sunset, "
				+ "each day brings its own unique beauty. To help you embrace the beauty of life, "
				+ "we have curated a collection of 10 beautiful day quotes that will uplift your spirit and "
				+ "inspire you to find joy in the simplest of moments. "
				+ "Whether you’re looking for a daily dose of positivity or "
				+ "seeking inspiration to make the most of each day, these quotes will remind you to appreciate the beauty that surrounds you and embrace the gift of life. "
				+ "So, join us on this journey of finding beauty in every day and let these quotes inspire you to "
				+ "live life to the fullest. Mark Twain, a renowned American writer and humorist, encourages us to approach each day with optimism and the belief that it has the potential "
				+ "to be the most beautiful day of our lives. This quote reminds us to embrace the present moment, "
				+ "find joy in the simple things, and appreciate the beauty that surrounds us. By applying this learning, we can cultivate a positive mindset and make the most of each day, "
				+ "finding beauty and happiness in even the smallest of moments";
	}
}
