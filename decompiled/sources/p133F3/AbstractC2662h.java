package p133F3;

import p031B3.InterfaceC0798b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: F3.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2662h implements InterfaceC0798b {

    /* JADX INFO: renamed from: a */
    public static final boolean f8173a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z6;
        if ("Amazon".equals(AbstractC20817s.f66108c)) {
            String str = AbstractC20817s.f66109d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        f8173a = z6;
    }
}
