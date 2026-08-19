package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p544W9.AbstractC8704r3;

/* JADX INFO: renamed from: Lm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5186l extends AbstractC8704r3 {

    /* JADX INFO: renamed from: a */
    public final JvmMemberSignature.Method f16870a;

    /* JADX INFO: renamed from: b */
    public final String f16871b;

    public C5186l(JvmMemberSignature.Method signature) {
        AbstractC16544l.m18094g(signature, "signature");
        this.f16870a = signature;
        this.f16871b = signature.asString();
    }

    @Override // p544W9.AbstractC8704r3
    /* JADX INFO: renamed from: a */
    public final String mo5750a() {
        return this.f16871b;
    }
}
