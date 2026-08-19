package p571X9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p229J0.EnumC3898D3;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p553Wh.C8870f;
import p795i.C14893g;

/* JADX INFO: renamed from: X9.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9209T {
    /* JADX INFO: renamed from: a */
    public static final void m9775a(C14893g c14893g, Object obj, C8870f appState, int i10) {
        AbstractC16544l.m18094g(c14893g, "<this>");
        AbstractC16544l.m18094g(appState, "appState");
        try {
            c14893g.mo10188b(obj);
        } catch (ActivityNotFoundException unused) {
            C8870f.m9548c(appState, appState.f27152e.m3160b(i10), EnumC3898D3.f11877Y, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9776b(Context context, C8870f c8870f, Intent intent) {
        AbstractC16544l.m18094g(context, "<this>");
        AbstractC16544l.m18094g(intent, "intent");
        C3430e c3430eM8749b = AbstractC8168p6.m8749b("safeStartActivity", null);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            AbstractC8160o6.m8731f(c3430eM8749b, "No activity for intent: " + intent, e10, null, 4);
            if (c8870f != null) {
                C8870f.m9547b(c8870f, R.string.navigation_no_activity);
            }
        } catch (SecurityException e11) {
            AbstractC8160o6.m8731f(c3430eM8749b, "Security error for intent: " + intent, e11, null, 4);
            if (c8870f != null) {
                C8870f.m9547b(c8870f, R.string.navigation_no_activity);
            }
        }
    }
}
