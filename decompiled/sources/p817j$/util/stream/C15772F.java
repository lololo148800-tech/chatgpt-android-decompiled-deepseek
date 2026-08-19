package p817j$.util.stream;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.function.Supplier;
import p817j$.util.C16024v;
import p817j$.util.C16025w;
import p817j$.util.C16027y;

/* JADX INFO: renamed from: j$.util.stream.F */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15772F implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49063a;

    public /* synthetic */ C15772F(int i10) {
        this.f49063a = i10;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49063a) {
            case 0:
                return new C15777G();
            case 1:
                return new C15782H();
            case 2:
                return new C15787I();
            case 3:
                return new C15792J();
            case 4:
                return new C16024v();
            case 5:
                return new ArrayList();
            case 6:
                return new C16025w();
            case 7:
                return new C16027y();
            case 8:
                return new LinkedHashSet();
            case 9:
                return new double[4];
            case 10:
                return new double[3];
            case 11:
                return new long[2];
            default:
                return new long[2];
        }
    }
}
