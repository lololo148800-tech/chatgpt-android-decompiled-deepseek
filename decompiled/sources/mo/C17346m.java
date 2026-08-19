package mo;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0675i;
import p026Ao.InterfaceC0676j;
import p571X9.AbstractC9282f0;

/* JADX INFO: renamed from: mo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C17346m extends AbstractC17325B {

    /* JADX INFO: renamed from: c */
    public static final C17352s f55277c;

    /* JADX INFO: renamed from: a */
    public final List f55278a;

    /* JADX INFO: renamed from: b */
    public final List f55279b;

    static {
        Pattern pattern = C17352s.f55296e;
        f55277c = AbstractC9282f0.m9857c("application/x-www-form-urlencoded");
    }

    public C17346m(ArrayList encodedNames, ArrayList encodedValues) {
        AbstractC16544l.m18094g(encodedNames, "encodedNames");
        AbstractC16544l.m18094g(encodedValues, "encodedValues");
        this.f55278a = AbstractC17708b.m19433y(encodedNames);
        this.f55279b = AbstractC17708b.m19433y(encodedValues);
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        return m19010e(null, true);
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        return f55277c;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) throws EOFException {
        m19010e(interfaceC0676j, false);
    }

    /* JADX INFO: renamed from: e */
    public final long m19010e(InterfaceC0676j interfaceC0676j, boolean z6) throws EOFException {
        C0675i c0675iMo1331b;
        if (z6) {
            c0675iMo1331b = new C0675i();
        } else {
            AbstractC16544l.m18091d(interfaceC0676j);
            c0675iMo1331b = interfaceC0676j.mo1331b();
        }
        List list = this.f55278a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c0675iMo1331b.m1436f1(38);
            }
            c0675iMo1331b.m1444l1((String) list.get(i10));
            c0675iMo1331b.m1436f1(61);
            c0675iMo1331b.m1444l1((String) this.f55279b.get(i10));
        }
        if (!z6) {
            return 0L;
        }
        long j10 = c0675iMo1331b.f1970Z;
        c0675iMo1331b.m1429a();
        return j10;
    }
}
