package p290Ld;

import kotlin.jvm.internal.AbstractC16544l;
import p593Y8.C9683j;
import p801i5.AbstractC14929a;
import p801i5.C14930b;
import p801i5.InterfaceC14933e;
import p801i5.InterfaceC14934f;

/* JADX INFO: renamed from: Ld.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5002e implements InterfaceC14934f {

    /* JADX INFO: renamed from: a */
    public static final C5002e f16319a = new C5002e();

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: a */
    public final InterfaceC14933e mo1904a(C9683j c9683j, long j10, long j11, AbstractC14929a[] callbacks) {
        AbstractC16544l.m18094g(callbacks, "callbacks");
        return new C14930b(new C5000c(j10, j11, c9683j, null, callbacks));
    }

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: b */
    public final InterfaceC14933e mo1905b(C9683j c9683j) {
        return new C14930b(new C4998a(c9683j, null));
    }

    @Override // p801i5.InterfaceC14934f
    public final long getVersion() {
        return 2L;
    }
}
