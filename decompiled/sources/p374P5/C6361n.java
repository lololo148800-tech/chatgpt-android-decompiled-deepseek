package p374P5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.AbstractC0682p;
import p033B5.C0828l;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;

/* JADX INFO: renamed from: P5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6361n {

    /* JADX INFO: renamed from: a */
    public final Context f20697a;

    /* JADX INFO: renamed from: b */
    public final C6579h f20698b;

    /* JADX INFO: renamed from: c */
    public final EnumC6578g f20699c;

    /* JADX INFO: renamed from: d */
    public final EnumC6575d f20700d;

    /* JADX INFO: renamed from: e */
    public final String f20701e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0682p f20702f;

    /* JADX INFO: renamed from: g */
    public final EnumC6349b f20703g;

    /* JADX INFO: renamed from: h */
    public final EnumC6349b f20704h;

    /* JADX INFO: renamed from: i */
    public final EnumC6349b f20705i;

    /* JADX INFO: renamed from: j */
    public final C0828l f20706j;

    public C6361n(Context context, C6579h c6579h, EnumC6578g enumC6578g, EnumC6575d enumC6575d, String str, AbstractC0682p abstractC0682p, EnumC6349b enumC6349b, EnumC6349b enumC6349b2, EnumC6349b enumC6349b3, C0828l c0828l) {
        this.f20697a = context;
        this.f20698b = c6579h;
        this.f20699c = enumC6578g;
        this.f20700d = enumC6575d;
        this.f20701e = str;
        this.f20702f = abstractC0682p;
        this.f20703g = enumC6349b;
        this.f20704h = enumC6349b2;
        this.f20705i = enumC6349b3;
        this.f20706j = c0828l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6361n)) {
            return false;
        }
        C6361n c6361n = (C6361n) obj;
        return AbstractC16544l.m18089b(this.f20697a, c6361n.f20697a) && AbstractC16544l.m18089b(this.f20698b, c6361n.f20698b) && this.f20699c == c6361n.f20699c && this.f20700d == c6361n.f20700d && AbstractC16544l.m18089b(this.f20701e, c6361n.f20701e) && AbstractC16544l.m18089b(this.f20702f, c6361n.f20702f) && this.f20703g == c6361n.f20703g && this.f20704h == c6361n.f20704h && this.f20705i == c6361n.f20705i && AbstractC16544l.m18089b(this.f20706j, c6361n.f20706j);
    }

    public final int hashCode() {
        int iHashCode = (this.f20700d.hashCode() + ((this.f20699c.hashCode() + ((this.f20698b.hashCode() + (this.f20697a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f20701e;
        return this.f20706j.f2309a.hashCode() + ((this.f20705i.hashCode() + ((this.f20704h.hashCode() + ((this.f20703g.hashCode() + ((this.f20702f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f20697a + ", size=" + this.f20698b + ", scale=" + this.f20699c + ", precision=" + this.f20700d + ", diskCacheKey=" + this.f20701e + ", fileSystem=" + this.f20702f + ", memoryCachePolicy=" + this.f20703g + ", diskCachePolicy=" + this.f20704h + ", networkCachePolicy=" + this.f20705i + ", extras=" + this.f20706j + ')';
    }
}
