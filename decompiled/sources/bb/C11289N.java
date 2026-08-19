package bb;

import java.io.Serializable;
import java.util.ArrayList;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: bb.N */
/* JADX INFO: loaded from: classes.dex */
public final class C11289N implements InterfaceC10536i, Serializable {

    /* JADX INFO: renamed from: Y */
    public final int f34180Y;

    public C11289N() {
        AbstractC11320m.m12724c(2, "expectedValuesPerKey");
        this.f34180Y = 2;
    }

    @Override // p644ab.InterfaceC10536i
    public final Object get() {
        return new ArrayList(this.f34180Y);
    }
}
