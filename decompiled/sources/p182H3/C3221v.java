package p182H3;

import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: H3.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3221v implements InterfaceC3225z {

    /* JADX INFO: renamed from: Z */
    public static final C3221v f9786Z = new C3221v(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9787Y;

    public /* synthetic */ C3221v(int i10) {
        this.f9787Y = i10;
    }

    @Override // p182H3.InterfaceC3225z
    /* JADX INFO: renamed from: a */
    public int mo254a(Object obj) {
        C3213n c3213n = (C3213n) obj;
        switch (this.f9787Y) {
            case 1:
                String str = c3213n.f9703a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC20817s.f66106a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c3213n.f9703a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
