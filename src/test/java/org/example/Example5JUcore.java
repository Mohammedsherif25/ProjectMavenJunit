package org.example;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Example5JUcore {
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(Example.class,Example3.class);
		int failureCount = r.getFailureCount();
		System.out.println("Failure Count :"+failureCount);
		int ignoreCount = r.getIgnoreCount();
		System.out.println("Ignore Counf :"+ignoreCount);
		int runCount = r.getRunCount();
		System.out.println("Run Count :"+runCount);
		long runTime = r.getRunTime();
		System.out.println("Run time :"+runTime);
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
	}
}
