package co;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17294A;
import mm.C17317t;
import mm.C17319v;
import mm.C17321x;
import p001A.C0042V0;
import p1113xn.AbstractC21329w;
import p277L.AbstractC4835h;
import p372P3.AbstractC6327i;
import p523V9.AbstractC7997T5;

/* JADX INFO: renamed from: co.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C11822l extends AbstractC4835h {

    /* JADX INFO: renamed from: b */
    public final AbstractC6327i f35831b;

    /* JADX INFO: renamed from: c */
    public final C0042V0 f35832c;

    public C11822l(AbstractC6327i abstractC6327i, AbstractC11516d json) {
        AbstractC16544l.m18094g(json, "json");
        this.f35831b = abstractC6327i;
        this.f35832c = json.f34844b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: A */
    public final byte mo5463A() {
        C17317t c17317t;
        AbstractC6327i abstractC6327i = this.f35831b;
        String strM6928l = abstractC6327i.m6928l();
        try {
            AbstractC16544l.m18094g(strM6928l, "<this>");
            C17319v c17319vM8303c = AbstractC7997T5.m8303c(strM6928l);
            if (c17319vM8303c != null) {
                int i10 = c17319vM8303c.f55151Y;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) > 0) {
                    c17317t = null;
                } else {
                    c17317t = new C17317t((byte) i10);
                }
            } else {
                c17317t = null;
            }
            if (c17317t != null) {
                return c17317t.f55149Y;
            }
            AbstractC21329w.m21727n(strM6928l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Failed to parse type 'UByte' for input '", strM6928l), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: B */
    public final short mo5464B() {
        C17294A c17294a;
        AbstractC6327i abstractC6327i = this.f35831b;
        String strM6928l = abstractC6327i.m6928l();
        try {
            AbstractC16544l.m18094g(strM6928l, "<this>");
            C17319v c17319vM8303c = AbstractC7997T5.m8303c(strM6928l);
            if (c17319vM8303c != null) {
                int i10 = c17319vM8303c.f55151Y;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) > 0) {
                    c17294a = null;
                } else {
                    c17294a = new C17294A((short) i10);
                }
            } else {
                c17294a = null;
            }
            if (c17294a != null) {
                return c17294a.f55117Y;
            }
            AbstractC21329w.m21727n(strM6928l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Failed to parse type 'UShort' for input '", strM6928l), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo10913a() {
        return this.f35832c;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: k */
    public final int mo5477k() {
        AbstractC6327i abstractC6327i = this.f35831b;
        String strM6928l = abstractC6327i.m6928l();
        try {
            AbstractC16544l.m18094g(strM6928l, "<this>");
            C17319v c17319vM8303c = AbstractC7997T5.m8303c(strM6928l);
            if (c17319vM8303c != null) {
                return c17319vM8303c.f55151Y;
            }
            AbstractC21329w.m21727n(strM6928l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Failed to parse type 'UInt' for input '", strM6928l), 0, null, 6);
            throw null;
        }
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final long mo5480n() {
        AbstractC6327i abstractC6327i = this.f35831b;
        String strM6928l = abstractC6327i.m6928l();
        try {
            AbstractC16544l.m18094g(strM6928l, "<this>");
            C17321x c17321xM8304d = AbstractC7997T5.m8304d(strM6928l);
            if (c17321xM8304d != null) {
                return c17321xM8304d.f55153Y;
            }
            AbstractC21329w.m21727n(strM6928l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Failed to parse type 'ULong' for input '", strM6928l), 0, null, 6);
            throw null;
        }
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public final int mo10914s(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
