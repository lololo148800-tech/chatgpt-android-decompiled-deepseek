package p523V9;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: V9.C4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7861C4 {
    /* JADX INFO: renamed from: a */
    public static String m8133a(View view) {
        AbstractC16544l.m18094g(view, "view");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.first);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.second);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(R.id.third);
        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(R.id.fourth);
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayout2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayout3.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayout4.getEditText();
        return AbstractC17680n.m19349Y(AbstractC17681o.m19382k(strValueOf, strValueOf2, strValueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)), "", null, null, 0, null, null, 62);
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m8134b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: c */
    public static String m8135c(String scope) {
        AbstractC16544l.m18094g(scope, "scope");
        List<String> listM21697e0 = AbstractC21322p.m21697e0(scope, new String[]{Separators.f31991SP}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM21697e0, 10));
        for (String str : listM21697e0) {
            Locale locale = Locale.ROOT;
            arrayList.add(AbstractC0168G.m534w(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)"));
        }
        return !arrayList.contains("openid") ? AbstractC21322p.m21711s0(AbstractC17680n.m19349Y(AbstractC17680n.m19362l0(arrayList, "openid"), Separators.f31991SP, null, null, 0, null, null, 62)).toString() : scope;
    }
}
