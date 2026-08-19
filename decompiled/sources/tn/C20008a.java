package tn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: tn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20008a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C20008a f63326Y = new C20008a();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        UnwrappedType unwrappedType = (UnwrappedType) obj;
        AbstractC16544l.m18091d(unwrappedType);
        return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
    }
}
