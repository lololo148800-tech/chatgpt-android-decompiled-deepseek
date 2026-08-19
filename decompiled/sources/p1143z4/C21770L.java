package p1143z4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8652j;

/* JADX INFO: renamed from: z4.L */
/* JADX INFO: loaded from: classes.dex */
public final class C21770L {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f69053b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f69054a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m22261a(AbstractC21769K navigator) {
        AbstractC16544l.m18094g(navigator, "navigator");
        String strM9332e = AbstractC8652j.m9332e(navigator.getClass());
        if (strM9332e.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f69054a;
        AbstractC21769K abstractC21769K = (AbstractC21769K) linkedHashMap.get(strM9332e);
        if (AbstractC16544l.m18089b(abstractC21769K, navigator)) {
            return;
        }
        boolean z6 = false;
        if (abstractC21769K != null && abstractC21769K.f69052b) {
            z6 = true;
        }
        if (z6) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC21769K).toString());
        }
        if (!navigator.f69052b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC21769K m22262b(String name) {
        AbstractC16544l.m18094g(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC21769K abstractC21769K = (AbstractC21769K) this.f69054a.get(name);
        if (abstractC21769K != null) {
            return abstractC21769K;
        }
        throw new IllegalStateException(AbstractC10763a.m11054l("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
