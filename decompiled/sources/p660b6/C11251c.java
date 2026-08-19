package p660b6;

import java.util.List;
import p591Y5.AbstractC9653d;
import p591Y5.C9662m;

/* JADX INFO: renamed from: b6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11251c implements InterfaceC11253e {

    /* JADX INFO: renamed from: Y */
    public final C11250b f34084Y;

    /* JADX INFO: renamed from: Z */
    public final C11250b f34085Z;

    public C11251c(C11250b c11250b, C11250b c11250b2) {
        this.f34084Y = c11250b;
        this.f34085Z = c11250b2;
    }

    @Override // p660b6.InterfaceC11253e
    public final boolean isStatic() {
        return this.f34084Y.isStatic() && this.f34085Z.isStatic();
    }

    @Override // p660b6.InterfaceC11253e
    /* JADX INFO: renamed from: p */
    public final AbstractC9653d mo10670p() {
        return new C9662m(this.f34084Y.mo10670p(), this.f34085Z.mo10670p());
    }

    @Override // p660b6.InterfaceC11253e
    /* JADX INFO: renamed from: w */
    public final List mo4538w() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
