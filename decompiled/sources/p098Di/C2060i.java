package p098Di;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Di.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2060i implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final String f6284a;

    /* JADX INFO: renamed from: b */
    public final Integer f6285b;

    public C2060i(Integer num, String str) {
        this.f6284a = str;
        this.f6285b = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2060i(String message) {
        this(null, message);
        AbstractC16544l.m18094g(message, "message");
    }

    public C2060i(int i10) {
        this(Integer.valueOf(i10), null);
    }
}
