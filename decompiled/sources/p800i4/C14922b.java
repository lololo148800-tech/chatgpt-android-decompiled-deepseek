package p800i4;

import java.math.RoundingMode;
import p1030u1.C20095b;
import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14922b implements InterfaceC14926f {

    /* JADX INFO: renamed from: a */
    public final long f46480a;

    /* JADX INFO: renamed from: b */
    public final C20095b f46481b;

    /* JADX INFO: renamed from: c */
    public final C20095b f46482c;

    /* JADX INFO: renamed from: d */
    public final int f46483d;

    /* JADX INFO: renamed from: e */
    public long f46484e;

    public C14922b(long j10, long j11, long j12) {
        this.f46484e = j10;
        this.f46480a = j12;
        C20095b c20095b = new C20095b();
        this.f46481b = c20095b;
        C20095b c20095b2 = new C20095b();
        this.f46482c = c20095b2;
        c20095b.m20921a(0L);
        c20095b2.m20921a(j11);
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f46483d = -2147483647;
            return;
        }
        long jM21396J = AbstractC20817s.m21396J(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jM21396J > 0 && jM21396J <= 2147483647L) {
            i10 = (int) jM21396J;
        }
        this.f46483d = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16090a(long j10) {
        C20095b c20095b = this.f46481b;
        return j10 - c20095b.m20924d(c20095b.f63624a - 1) < 100000;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: b */
    public final long mo16087b() {
        return this.f46480a;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: e */
    public final long mo16088e(long j10) {
        return this.f46481b.m20924d(AbstractC20817s.m21402c(this.f46482c, j10));
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        C20095b c20095b = this.f46481b;
        int iM21402c = AbstractC20817s.m21402c(c20095b, j10);
        long jM20924d = c20095b.m20924d(iM21402c);
        C20095b c20095b2 = this.f46482c;
        C6311C c6311c = new C6311C(jM20924d, c20095b2.m20924d(iM21402c));
        if (jM20924d == j10 || iM21402c == c20095b.f63624a - 1) {
            return new C6309A(c6311c, c6311c);
        }
        int i10 = iM21402c + 1;
        return new C6309A(c6311c, new C6311C(c20095b.m20924d(i10), c20095b2.m20924d(i10)));
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: k */
    public final int mo16089k() {
        return this.f46483d;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f46484e;
    }
}
