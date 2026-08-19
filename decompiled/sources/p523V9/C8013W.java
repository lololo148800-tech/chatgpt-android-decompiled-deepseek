package p523V9;

import p1024tb.C19834e;
import p544W9.C8628f;
import p571X9.C9126F;
import p594Y9.C9747J;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18666g;

/* JADX INFO: renamed from: V9.W */
/* JADX INFO: loaded from: classes.dex */
public final class C8013W implements InterfaceC18666g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25304a;

    /* JADX INFO: renamed from: b */
    public boolean f25305b = false;

    /* JADX INFO: renamed from: c */
    public boolean f25306c = false;

    /* JADX INFO: renamed from: d */
    public C18662c f25307d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18664e f25308e;

    public /* synthetic */ C8013W(InterfaceC18664e interfaceC18664e, int i10) {
        this.f25304a = i10;
        this.f25308e = interfaceC18664e;
    }

    @Override // p961qb.InterfaceC18666g
    /* JADX INFO: renamed from: d */
    public final InterfaceC18666g mo8335d(String str) {
        switch (this.f25304a) {
            case 0:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C8006V) this.f25308e).m8317d(this.f25307d, str, this.f25306c);
                return this;
            case 1:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C8628f) this.f25308e).m9280d(this.f25307d, str, this.f25306c);
                return this;
            case 2:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C9126F) this.f25308e).m9662d(this.f25307d, str, this.f25306c);
                return this;
            case 3:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C9747J) this.f25308e).m10342d(this.f25307d, str, this.f25306c);
                return this;
            default:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C19834e) this.f25308e).m20775e(this.f25307d, str, this.f25306c);
                return this;
        }
    }

    @Override // p961qb.InterfaceC18666g
    /* JADX INFO: renamed from: e */
    public final InterfaceC18666g mo8336e(boolean z6) {
        switch (this.f25304a) {
            case 0:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C8006V) this.f25308e).m8318e(this.f25307d, z6 ? 1 : 0, this.f25306c);
                return this;
            case 1:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C8628f) this.f25308e).m9281e(this.f25307d, z6 ? 1 : 0, this.f25306c);
                return this;
            case 2:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C9126F) this.f25308e).m9663e(this.f25307d, z6 ? 1 : 0, this.f25306c);
                return this;
            case 3:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C9747J) this.f25308e).m10343e(this.f25307d, z6 ? 1 : 0, this.f25306c);
                return this;
            default:
                if (this.f25305b) {
                    throw new C18661b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25305b = true;
                ((C19834e) this.f25308e).m20774d(this.f25307d, z6 ? 1 : 0, this.f25306c);
                return this;
        }
    }
}
