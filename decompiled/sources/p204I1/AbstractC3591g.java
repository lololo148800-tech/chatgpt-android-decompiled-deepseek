package p204I1;

import java.util.ArrayList;
import java.util.List;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: I1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3591g {

    /* JADX INFO: renamed from: a */
    public static final C3590f f10938a = new C3590f(6, "", null);

    /* JADX INFO: renamed from: a */
    public static final ArrayList m4302a(List list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C3588d c3588d = (C3588d) obj;
            if (m4304c(i10, i11, c3588d.f10931b, c3588d.f10932c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3588d c3588d2 = (C3588d) arrayList.get(i13);
            arrayList2.add(new C3588d(c3588d2.f10930a, Math.max(i10, c3588d2.f10931b) - i10, Math.min(i11, c3588d2.f10932c) - i10, c3588d2.f10933d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final List m4303b(C3590f c3590f, int i10, int i11) {
        List list;
        if (i10 == i11 || (list = c3590f.f10935Z) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c3590f.f10934Y.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C3588d c3588d = (C3588d) obj;
            if (m4304c(i10, i11, c3588d.f10931b, c3588d.f10932c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3588d c3588d2 = (C3588d) arrayList.get(i13);
            arrayList2.add(new C3588d(c3588d2.f10930a, AbstractC8301I.m8921l(c3588d2.f10931b, i10, i11) - i10, AbstractC8301I.m8921l(c3588d2.f10932c, i10, i11) - i10));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4304c(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        if (i12 <= i10 && i11 <= i13) {
            if (i13 != i11) {
                return true;
            }
            if ((i10 == i11) == (i12 == i13)) {
                return true;
            }
        }
        return false;
    }
}
