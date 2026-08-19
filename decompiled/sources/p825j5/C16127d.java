package p825j5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import mm.C17296C;
import p593Y8.C9683j;
import p801i5.C14932d;
import p801i5.InterfaceC14933e;

/* JADX INFO: renamed from: j5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16127d {

    /* JADX INFO: renamed from: f */
    public boolean f50046f;

    /* JADX INFO: renamed from: h */
    public final C16127d f50048h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C9683j f50049i;

    /* JADX INFO: renamed from: a */
    public final long f50041a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b */
    public final ArrayList f50042b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f50043c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f50044d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f50045e = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public boolean f50047g = true;

    public C16127d(C9683j c9683j, C16127d c16127d) {
        this.f50049i = c9683j;
        this.f50048h = c16127d;
    }

    /* JADX INFO: renamed from: a */
    public final C14932d m17683a() {
        if (this.f50041a != Thread.currentThread().getId()) {
            throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
        }
        boolean z6 = this.f50046f && this.f50047g;
        C16127d c16127d = this.f50048h;
        C9683j c9683j = this.f50049i;
        if (c16127d == null) {
            if (z6) {
                c9683j.m10271E().m5028r0();
                c9683j.m10271E().m5027m();
            } else {
                c9683j.m10271E().m5027m();
            }
        }
        ((ThreadLocal) c9683j.f29194p0).set(c16127d);
        InterfaceC14933e.f46523a.getClass();
        return new C14932d(C17296C.f55119a);
    }
}
