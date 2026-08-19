package co;

import android.gov.nist.core.Separators;
import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p826j6.C16137F;

/* JADX INFO: renamed from: co.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C11821k extends C0095w0 {

    /* JADX INFO: renamed from: p0 */
    public final AbstractC11516d f35829p0;

    /* JADX INFO: renamed from: q0 */
    public int f35830q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11821k(C16137F c16137f, AbstractC11516d json) {
        super(c16137f);
        AbstractC16544l.m18094g(json, "json");
        this.f35829p0 = json;
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: C */
    public final void mo359C() {
        m380q(' ');
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: E */
    public final void mo361E() {
        this.f35830q0--;
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: i */
    public final void mo372i() {
        this.f410Z = true;
        this.f35830q0++;
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: n */
    public final void mo377n() {
        this.f410Z = false;
        m385w(Separators.RETURN);
        int i10 = this.f35830q0;
        for (int i11 = 0; i11 < i10; i11++) {
            m385w(this.f35829p0.f34843a.f34875g);
        }
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: o */
    public final void mo378o() {
        if (this.f410Z) {
            this.f410Z = false;
        } else {
            mo377n();
        }
    }
}
