package p994rk;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputDateComponent;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p310M9.C5311e;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9123E2;
import p658b5.C11232c;
import p791hj.C14522e;
import p909nm.C17689w;
import p970qk.C18759b;
import uk.C20375e;

/* JADX INFO: renamed from: rk.k0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19183k0 {
    /* JADX INFO: renamed from: a */
    public static final ConstraintLayout m20315a(InputDateComponent inputDateComponent, C5311e c5311e, C14522e dateController) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        UiComponentConfig.InputSelectComponentStyle inputSelectStyle;
        AbstractC16544l.m18094g(inputDateComponent, "<this>");
        AbstractC16544l.m18094g(dateController, "dateController");
        View viewInflate = ((LayoutInflater) c5311e.f17485o0).inflate(R.layout.pi2_ui_date_field, (ViewGroup) null, false);
        int i10 = R.id.date_label;
        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.date_label);
        if (textView != null) {
            i10 = R.id.day;
            TextInputLayout textInputLayout = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.day);
            if (textInputLayout != null) {
                i10 = R.id.day_edit_text;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.day_edit_text);
                if (textInputEditText != null) {
                    i10 = R.id.error_label;
                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.error_label);
                    if (textView2 != null) {
                        i10 = R.id.month;
                        TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.month);
                        if (textInputLayout2 != null) {
                            i10 = R.id.month_edit_text;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate, R.id.month_edit_text);
                            if (autoCompleteTextView != null) {
                                i10 = R.id.year;
                                TextInputLayout textInputLayout3 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.year);
                                if (textInputLayout3 != null) {
                                    i10 = R.id.year_edit_text;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.year_edit_text);
                                    if (textInputEditText2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        C20375e c20375e = new C20375e(constraintLayout, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
                                        UiComponentConfig.InputDate inputDate = inputDateComponent.f40958Y;
                                        UiComponentConfig.InputDateComponentStyle styles = inputDate.getStyles();
                                        UiComponentConfig.InputDate.Attributes attributes = inputDate.getAttributes();
                                        if (attributes != null) {
                                            textView.setText(attributes.getLabel());
                                            List<String> textMonths = attributes.getTextMonths();
                                            if (textMonths == null) {
                                                textMonths = C17689w.f56480Y;
                                            }
                                            C18759b c18759b = new C18759b((Context) c5311e.f17484Z, R.layout.pi2_ui_date_list_item, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
                                            AbstractC8700r.m9406b((C11232c) dateController.f45763o0, autoCompleteTextView);
                                            autoCompleteTextView.setAdapter(c18759b);
                                            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                                                autoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
                                            }
                                            textInputLayout.setHint(attributes.getPlaceholderDay());
                                            AbstractC8700r.m9406b((C11232c) dateController.f45764p0, textInputEditText);
                                            textInputLayout3.setHint(attributes.getPlaceholderYear());
                                            AbstractC8700r.m9406b((C11232c) dateController.f45762Z, textInputEditText2);
                                        }
                                        ((LinkedList) c5311e.f17486p0).add(new C19179j0(styles, c20375e));
                                        constraintLayout.setTag(c20375e);
                                        return constraintLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
