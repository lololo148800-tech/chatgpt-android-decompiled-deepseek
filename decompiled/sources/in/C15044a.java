package in;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: in.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C15044a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C15044a f46763Y = new C15044a();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        IntegerLiteralTypeConstructor.Companion companion = IntegerLiteralTypeConstructor.Companion;
        AbstractC16544l.m18094g(it, "it");
        return it.toString();
    }
}
