package p281L3;

import p1016t3.C19765O;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: L3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4929p {

    /* JADX INFO: renamed from: a */
    public final C19765O f16092a;

    /* JADX INFO: renamed from: b */
    public final int[] f16093b;

    public C4929p(C19765O c19765o, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC20800b.m21325m("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f16092a = c19765o;
        this.f16093b = iArr;
    }
}
