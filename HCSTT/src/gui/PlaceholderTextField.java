package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class PlaceholderTextField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String placeholder;

	public PlaceholderTextField() {
	}

	public PlaceholderTextField(final Document pDoc, final String pText, final int pColumns) {
		super(pDoc, pText, pColumns);
	}

	public PlaceholderTextField(final int pColumns) {
		super(pColumns);
	}

	public PlaceholderTextField(final String pText) {
		super(pText);
	}

	public PlaceholderTextField(final String pText, final int pColumns) {
		super(pText, pColumns);
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	@Override
	protected void paintComponent(final Graphics pG) {
		super.paintComponent(pG);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		if (placeholder.length() == 0 || getText().length() > 0) {
			return;
		}

		final Graphics2D g = (Graphics2D) pG;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(getDisabledTextColor());
		g.drawString(placeholder, getInsets().left + 5, pG.getFontMetrics().getMaxAscent() + getInsets().top + 4);
	}
}
