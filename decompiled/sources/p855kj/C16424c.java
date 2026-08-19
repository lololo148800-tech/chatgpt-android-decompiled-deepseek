package p855kj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16424c extends AbstractC16428g {

    /* JADX INFO: renamed from: a */
    public final String f50953a;

    public C16424c(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f50953a = name;
    }

    @Override // p855kj.AbstractC16428g
    /* JADX INFO: renamed from: a */
    public final String mo18009a() {
        return this.f50953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16424c) {
            return AbstractC16544l.m18089b(this.f50953a, ((C16424c) obj).f50953a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f50953a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f50953a, Separators.RPAREN, new StringBuilder("BluetoothHeadset(name="));
    }
}
