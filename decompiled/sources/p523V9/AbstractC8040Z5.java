package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.javax.sip.C10808o;
import android.util.TypedValue;
import com.openai.chatgpt.R;
import fk.EnumC13687h;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.FrameCryptorKeyProvider;
import p003A1.AbstractC0168G;
import p1113xn.C21307a;
import p403Qd.C6636i;
import p925oe.C18077B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.Z5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8040Z5 {
    /* JADX INFO: renamed from: a */
    public static Object m8405a(C18077B c18077b, C6636i c6636i, boolean z6, AbstractC19687c abstractC19687c) {
        return c18077b.m19696a(c6636i, c6636i != null ? c6636i.f21380b : null, z6, abstractC19687c);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8406b(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true) && typedValue.type == 18) {
            return typedValue.data != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static Object m8407c(C18077B c18077b, C6636i c6636i, AbstractC19687c abstractC19687c) {
        return c18077b.m19697b(c6636i, c6636i != null ? c6636i.f21380b : null, abstractC19687c);
    }

    /* JADX INFO: renamed from: d */
    public static int m8408d(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        AbstractC16544l.m18094g(context, "<this>");
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: e */
    public static Integer m8409e(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        AbstractC16544l.m18094g(context, "<this>");
        context.getTheme().resolveAttribute(i10, typedValue, true);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: f */
    public static final Integer m8410f(Context context, String resourceName, EnumC13687h enumC13687h) {
        AbstractC16544l.m18094g(context, "<this>");
        AbstractC16544l.m18094g(resourceName, "resourceName");
        Locale locale = Locale.US;
        String strM534w = AbstractC0168G.m534w(locale, "US", resourceName, locale, "this as java.lang.String).toLowerCase(locale)");
        Pattern patternCompile = Pattern.compile("[- ]");
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM534w).replaceAll("_");
        AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
        String resourcePackageName = context.getResources().getResourcePackageName(R.id.pi2_dummy_package_resource);
        int identifier = context.getResources().getIdentifier(strReplaceAll, enumC13687h.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = enumC13687h.name().toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            identifier = resources.getIdentifier(strReplaceAll, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m8411g(C10808o c10808o, String key) {
        Integer num = 0;
        c10808o.getClass();
        AbstractC16544l.m18094g(key, "key");
        int iIntValue = num.intValue();
        byte[] bytes = key.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        ((FrameCryptorKeyProvider) c10808o.f32040Z).setSharedKey(iIntValue, bytes);
    }

    /* JADX INFO: renamed from: h */
    public static Object m8412h(C18077B c18077b, C6636i c6636i, AbstractC19687c abstractC19687c) {
        return c18077b.f57657c.m3176e(c6636i, true, abstractC19687c);
    }
}
