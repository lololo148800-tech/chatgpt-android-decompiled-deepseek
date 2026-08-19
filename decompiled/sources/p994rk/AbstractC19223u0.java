package p994rk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p310M9.C5311e;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9123E2;
import uk.C20380j;

/* JADX INFO: renamed from: rk.u0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19223u0 {
    /* JADX INFO: renamed from: a */
    public static final ConstraintLayout m20327a(C19207q0 c19207q0, C5311e c5311e) {
        AbstractC16544l.m18094g(c19207q0, "<this>");
        View viewInflate = ((LayoutInflater) c5311e.f17485o0).inflate(R.layout.pi2_ui_international_db_field, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i10 = R.id.idb_country_input;
        TextInputLayout textInputLayout = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.idb_country_input);
        if (textInputLayout != null) {
            i10 = R.id.idb_country_text_view;
            if (((AutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate, R.id.idb_country_text_view)) != null) {
                i10 = R.id.idb_description;
                TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.idb_description);
                if (textView != null) {
                    i10 = R.id.idb_id_type_input;
                    TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.idb_id_type_input);
                    if (textInputLayout2 != null) {
                        i10 = R.id.idb_id_type_text_view;
                        if (((AutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate, R.id.idb_id_type_text_view)) != null) {
                            i10 = R.id.idb_label;
                            TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.idb_label);
                            if (textView2 != null) {
                                i10 = R.id.idb_value_input;
                                TextInputLayout textInputLayout3 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.idb_value_input);
                                if (textInputLayout3 != null) {
                                    i10 = R.id.idb_value_text_view;
                                    if (((TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.idb_value_text_view)) != null) {
                                        C20380j c20380j = new C20380j(constraintLayout, textInputLayout, textView, textInputLayout2, textView2, textInputLayout3);
                                        UiComponentConfig.InputInternationalDb.Attributes attributes = c19207q0.f60934Y.getAttributes();
                                        textView2.setText(attributes != null ? attributes.getLabel() : null);
                                        textInputLayout.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
                                        textInputLayout2.setHint(attributes != null ? attributes.getLabelIdbType() : null);
                                        textInputLayout3.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
                                        EditText editText = textInputLayout3.getEditText();
                                        if (editText != null) {
                                            AbstractC8700r.m9406b(c19207q0.f60944w0, editText);
                                        }
                                        ((LinkedList) c5311e.f17486p0).add(new C19219t0(c19207q0, c20380j));
                                        constraintLayout.setTag(c20380j);
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
