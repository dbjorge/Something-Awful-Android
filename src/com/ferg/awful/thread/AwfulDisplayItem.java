package com.ferg.awful.thread;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface AwfulDisplayItem {
	public View getView(LayoutInflater inf, View current, ViewGroup parent);
	public int getID();
	public DISPLAY_TYPE getType();
	public boolean isEnabled();
	public enum DISPLAY_TYPE {POST, THREAD, FORUM};
}