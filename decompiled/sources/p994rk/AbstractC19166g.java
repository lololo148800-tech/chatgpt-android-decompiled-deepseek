package p994rk;

import android.content.Context;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p1124ya.C21394b;
import p310M9.C5311e;
import p887m7.C17176b;

/* JADX INFO: renamed from: rk.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19166g {
    /* JADX INFO: renamed from: a */
    public static final C21394b m20311a(C19162f c19162f, C5311e c5311e) {
        AbstractC16544l.m18094g(c19162f, "<this>");
        UiComponentConfig.Branding.Attributes attributes = c19162f.f60874Y.getAttributes();
        if (attributes != null ? AbstractC16544l.m18089b(attributes.getHideLogo(), Boolean.TRUE) : false) {
            return null;
        }
        Context context = (Context) c5311e.f17484Z;
        C21394b c21394b = new C21394b(context);
        c21394b.setImageResource(R.drawable.pi2_inquiry_persona_branding);
        c21394b.setAdjustViewBounds(true);
        int dimension = (int) context.getResources().getDimension(R.dimen.startEndMargin);
        c21394b.setPadding(dimension, c21394b.getPaddingTop(), dimension, c21394b.getPaddingBottom());
        ((LinkedList) c5311e.f17486p0).add(new C17176b(c21394b, 14));
        return c21394b;
    }
}
