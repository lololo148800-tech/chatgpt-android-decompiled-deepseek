package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.v1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12200v1 extends AbstractC12206x1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12200v1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f37116b = i10;
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: c */
    public final void mo14155c(long j10, byte[] bArr, long j11) {
        switch (this.f37116b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: d */
    public final boolean mo14156d(long j10, Object obj) {
        switch (this.f37116b) {
            case 0:
                if (AbstractC12209y1.f37129h) {
                    if (AbstractC12209y1.m14185h(j10, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC12209y1.m14186i(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC12209y1.f37129h) {
                    if (AbstractC12209y1.m14185h(j10, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC12209y1.m14186i(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: e */
    public final byte mo14157e(long j10) {
        switch (this.f37116b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: f */
    public final byte mo14158f(long j10, Object obj) {
        switch (this.f37116b) {
            case 0:
                return AbstractC12209y1.f37129h ? AbstractC12209y1.m14185h(j10, obj) : AbstractC12209y1.m14186i(j10, obj);
            default:
                return AbstractC12209y1.f37129h ? AbstractC12209y1.m14185h(j10, obj) : AbstractC12209y1.m14186i(j10, obj);
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: g */
    public final double mo14159g(long j10, Object obj) {
        switch (this.f37116b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m14172j(j10, obj));
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: h */
    public final float mo14160h(long j10, Object obj) {
        switch (this.f37116b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m14171i(j10, obj));
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: m */
    public final void mo14161m(Object obj, long j10, boolean z6) {
        switch (this.f37116b) {
            case 0:
                if (!AbstractC12209y1.f37129h) {
                    AbstractC12209y1.m14194q(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC12209y1.m14193p(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC12209y1.f37129h) {
                    AbstractC12209y1.m14194q(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC12209y1.m14193p(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: n */
    public final void mo14162n(Object obj, long j10, byte b) {
        switch (this.f37116b) {
            case 0:
                if (!AbstractC12209y1.f37129h) {
                    AbstractC12209y1.m14194q(obj, j10, b);
                } else {
                    AbstractC12209y1.m14193p(obj, j10, b);
                }
                break;
            default:
                if (!AbstractC12209y1.f37129h) {
                    AbstractC12209y1.m14194q(obj, j10, b);
                } else {
                    AbstractC12209y1.m14193p(obj, j10, b);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: o */
    public final void mo14163o(Object obj, long j10, double d10) {
        switch (this.f37116b) {
            case 0:
                m14176r(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                m14176r(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: p */
    public final void mo14164p(Object obj, long j10, float f10) {
        switch (this.f37116b) {
            case 0:
                m14175q(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                m14175q(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: u */
    public final boolean mo14165u() {
        switch (this.f37116b) {
        }
        return false;
    }
}
