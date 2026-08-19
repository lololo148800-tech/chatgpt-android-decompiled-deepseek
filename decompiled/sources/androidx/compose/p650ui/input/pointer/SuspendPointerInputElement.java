package androidx.compose.p650ui.input.pointer;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1071w0.InterfaceC20772r0;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lz1/S;", "Lt1/A;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SuspendPointerInputElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final Object f32740Y;

    /* JADX INFO: renamed from: Z */
    public final Object f32741Z;

    /* JADX INFO: renamed from: o0 */
    public final Object[] f32742o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1439n f32743p0;

    public SuspendPointerInputElement(Object obj, InterfaceC20772r0 interfaceC20772r0, InterfaceC1439n interfaceC1439n, int i10) {
        interfaceC20772r0 = (i10 & 2) != 0 ? null : interfaceC20772r0;
        this.f32740Y = obj;
        this.f32741Z = interfaceC20772r0;
        this.f32742o0 = null;
        this.f32743p0 = interfaceC1439n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C19723A(this.f32740Y, this.f32741Z, this.f32742o0, this.f32743p0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!AbstractC16544l.m18089b(this.f32740Y, suspendPointerInputElement.f32740Y) || !AbstractC16544l.m18089b(this.f32741Z, suspendPointerInputElement.f32741Z)) {
            return false;
        }
        Object[] objArr = this.f32742o0;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f32742o0;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f32742o0 != null) {
            return false;
        }
        return this.f32743p0 == suspendPointerInputElement.f32743p0;
    }

    public final int hashCode() {
        Object obj = this.f32740Y;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f32741Z;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f32742o0;
        return this.f32743p0.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C19723A c19723a = (C19723A) abstractC10458p;
        Object obj = c19723a.f62445z0;
        Object obj2 = this.f32740Y;
        boolean z6 = !AbstractC16544l.m18089b(obj, obj2);
        c19723a.f62445z0 = obj2;
        Object obj3 = c19723a.f62436A0;
        Object obj4 = this.f32741Z;
        if (!AbstractC16544l.m18089b(obj3, obj4)) {
            z6 = true;
        }
        c19723a.f62436A0 = obj4;
        Object[] objArr = c19723a.f62437B0;
        Object[] objArr2 = this.f32742o0;
        if (objArr != null && objArr2 == null) {
            z6 = true;
        }
        if (objArr == null && objArr2 != null) {
            z6 = true;
        }
        boolean z10 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z6 : true;
        c19723a.f62437B0 = objArr2;
        if (z10) {
            c19723a.m20669M0();
        }
        c19723a.f62438C0 = this.f32743p0;
    }
}
