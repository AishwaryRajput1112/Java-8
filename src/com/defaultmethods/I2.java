package com.defaultmethods;

public interface I2 {

	default void m() {
		System.out.println("Hiiii---I2");
	}
}
