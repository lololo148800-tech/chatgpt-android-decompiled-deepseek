package ao;

import android.gov.nist.core.Separators;
import io.sentry.config.AbstractC15340a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mm.C17314q;
import p030B2.C0742X;
import p571X9.AbstractC9227W;
import p606Yn.C10107h;
import p606Yn.C10109j;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: ao.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C11200y extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m */
    public final C10109j f33865m;

    /* JADX INFO: renamed from: n */
    public final C17314q f33866n;

    public C11200y(String str, int i10) {
        super(str, null, i10);
        this.f33865m = C10109j.f29934b;
        this.f33866n = AbstractC9227W.m9800c(new C11198x(i10, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.getKind() != C10109j.f29934b) {
            return false;
        }
        return this.f53318a.equals(serialDescriptor.mo10679a()) && AbstractC16544l.m18089b(AbstractC11153a0.m12379b(this), AbstractC11153a0.m12379b(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return this.f33865m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return ((SerialDescriptor[]) this.f33866n.getValue())[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.f53318a.hashCode();
        C0742X c0742x = new C0742X(this);
        int iHashCode2 = 1;
        while (c0742x.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) c0742x.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return AbstractC17680n.m19349Y(new C10107h(this, 0), ", ", this.f53318a.concat(Separators.LPAREN), Separators.RPAREN, 0, null, null, 56);
    }
}
