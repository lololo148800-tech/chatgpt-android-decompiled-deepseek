package p024Am;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Am.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0560a extends Error {
    public C0560a() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560a(String message) {
        super(message);
        AbstractC16544l.m18094g(message, "message");
    }
}
