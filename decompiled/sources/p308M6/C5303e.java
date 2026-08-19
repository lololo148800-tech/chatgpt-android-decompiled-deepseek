package p308M6;

import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: M6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5303e implements InterfaceC5300b {

    /* JADX INFO: renamed from: a */
    public final HashMap f17469a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m5837a(String paramName, C5299a c5299a) {
        AbstractC16544l.m18094g(paramName, "paramName");
        this.f17469a.put(paramName, c5299a);
    }

    /* JADX INFO: renamed from: b */
    public final void m5838b(String str, float f10) {
        C5299a c5299a = (C5299a) this.f17469a.get(str);
        if (c5299a == null) {
            return;
        }
        c5299a.f17466c = Float.valueOf(f10);
    }

    /* JADX INFO: renamed from: c */
    public final void m5839c(String str, float[] value) {
        AbstractC16544l.m18094g(value, "value");
        C5299a c5299a = (C5299a) this.f17469a.get(str);
        if (c5299a == null) {
            return;
        }
        c5299a.f17466c = value;
    }
}
