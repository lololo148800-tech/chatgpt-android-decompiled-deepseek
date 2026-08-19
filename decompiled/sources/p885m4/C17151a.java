package p885m4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mp.C17360a;
import mp.InterfaceC17361b;
import p1093x.InterfaceC21040b;
import p523V9.AbstractC7862C5;
import p571X9.AbstractC9153J2;
import p765g7.InterfaceC13823a;
import p879lp.EnumC17120c;
import p959q8.InterfaceC18646h;
import p976r.InterfaceC18825w;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17151a implements InterfaceC17361b, InterfaceC18646h, InterfaceC18825w, InterfaceC21040b {
    @Override // p1093x.InterfaceC21040b
    /* JADX INFO: renamed from: b */
    public ArrayList mo18907b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            byte[] bArrM8136a = AbstractC7862C5.m8136a(signature);
            if (bArrM8136a == null) {
                return null;
            }
            arrayList.add(bArrM8136a);
        }
        return arrayList;
    }

    @Override // mp.InterfaceC17361b
    /* JADX INFO: renamed from: d */
    public C17360a mo18886d(int i10, int i11, CharSequence charSequence) {
        int iM9701b;
        int i12 = i10 + 3;
        if (i12 >= charSequence.length() || charSequence.charAt(i10 + 1) != '/' || charSequence.charAt(i10 + 2) != '/') {
            return null;
        }
        int i13 = -1;
        int i14 = -1;
        for (int i15 = i10 - 1; i15 >= i11; i15--) {
            char cCharAt = charSequence.charAt(i15);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                        break;
                    }
                } else {
                    i14 = i15;
                }
            } else {
                i13 = i15;
            }
        }
        if (i13 > 0 && i13 - 1 == i14) {
            i13 = -1;
        }
        if (i13 == -1 || (iM9701b = AbstractC9153J2.m9701b(i12, charSequence)) == -1) {
            return null;
        }
        return new C17360a(EnumC17120c.f54726Y, i13, iM9701b + 1);
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: e */
    public void mo15103e(InterfaceC13823a interfaceC13823a, Context context) {
        AbstractC16544l.m18094g(context, "context");
    }

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: g */
    public boolean mo10214g(MenuC18814l menuC18814l) {
        return false;
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: a */
    public void mo15102a(Context context) {
    }

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: c */
    public void mo10212c(MenuC18814l menuC18814l, boolean z6) {
    }
}
