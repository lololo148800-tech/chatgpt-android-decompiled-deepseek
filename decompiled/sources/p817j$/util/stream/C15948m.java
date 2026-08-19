package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.m */
/* JADX INFO: loaded from: classes4.dex */
final class C15948m extends AbstractC15939k2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49343b = 2;

    /* JADX INFO: renamed from: c */
    boolean f49344c;

    /* JADX INFO: renamed from: d */
    Object f49345d;

    public /* synthetic */ C15948m(InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15948m(C15826P3 c15826p3, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49345d = c15826p3;
        this.f49344c = true;
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        switch (this.f49343b) {
            case 0:
                this.f49344c = false;
                this.f49345d = null;
                this.f49330a.mo17364l(-1L);
                break;
            case 1:
                this.f49330a.mo17364l(-1L);
                break;
            default:
                this.f49330a.mo17364l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) throws Exception {
        switch (this.f49343b) {
            case 0:
                InterfaceC15963o2 interfaceC15963o2 = this.f49330a;
                if (obj == null) {
                    if (this.f49344c) {
                        return;
                    }
                    this.f49344c = true;
                    this.f49345d = null;
                    interfaceC15963o2.m17405p((Object) null);
                    return;
                }
                Object obj2 = this.f49345d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f49345d = obj;
                    interfaceC15963o2.m17405p(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C15800K2) ((C15981s) this.f49345d).f49397n).apply(obj);
                if (stream != null) {
                    try {
                        boolean z6 = this.f49344c;
                        InterfaceC15963o2 interfaceC15963o3 = this.f49330a;
                        if (!z6) {
                            ((Stream) stream.sequential()).forEach(interfaceC15963o3);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC15963o3.mo17358n() && spliterator.tryAdvance(interfaceC15963o3)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f49344c) {
                    boolean zTest = ((C15826P3) this.f49345d).f49148m.test(obj);
                    this.f49344c = zTest;
                    if (zTest) {
                        this.f49330a.m17405p(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public boolean mo17358n() {
        switch (this.f49343b) {
            case 1:
                this.f49344c = true;
                return this.f49330a.mo17358n();
            case 2:
                return !this.f49344c || this.f49330a.mo17358n();
            default:
                return super.mo17358n();
        }
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public void mo17363k() {
        switch (this.f49343b) {
            case 0:
                this.f49344c = false;
                this.f49345d = null;
                this.f49330a.mo17363k();
                break;
            default:
                super.mo17363k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15948m(C15981s c15981s, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49345d = c15981s;
    }
}
