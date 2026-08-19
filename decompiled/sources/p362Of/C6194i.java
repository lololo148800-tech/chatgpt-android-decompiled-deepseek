package p362Of;

import android.net.Uri;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p000.C12941d;
import p049Bm.InterfaceC1436k;
import p1025te.C19850A;
import p1025te.C19861L;
import p269Kh.C4679f;
import p324Mn.C5554x;
import p349O0.C5950F;
import p349O0.InterfaceC5985X;
import p350O1.C6045C;
import p492U1.C7545j;
import p737f1.EnumC13525q;
import p810ig.AbstractC14982a;
import p810ig.AbstractC14993l;

/* JADX INFO: renamed from: Of.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6194i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20172Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f20173Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6194i(InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f20172Y = i10;
        this.f20173Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f20173Z;
        switch (this.f20172Y) {
            case 0:
                AsyncImagePainter$State$Success it = (AsyncImagePainter$State$Success) obj;
                AbstractC16544l.m18094g(it, "it");
                interfaceC5985X.setValue(it);
                return c17296c;
            case 1:
                AsyncImagePainter$State$Error it2 = (AsyncImagePainter$State$Error) obj;
                AbstractC16544l.m18094g(it2, "it");
                interfaceC5985X.setValue(it2);
                return c17296c;
            case 2:
                ((Boolean) obj).booleanValue();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 3:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 4:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 5:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 6:
                C6045C value = (C6045C) obj;
                AbstractC16544l.m18094g(value, "value");
                if (value.f19682a.f10934Y.length() <= 50) {
                    interfaceC5985X.setValue(value);
                }
                return c17296c;
            case 7:
                String it3 = (String) obj;
                AbstractC16544l.m18094g(it3, "it");
                interfaceC5985X.setValue(it3);
                return c17296c;
            case 8:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 9:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 10:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                return new C12941d(interfaceC5985X, 2);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                interfaceC5985X.setValue(bool);
                return c17296c;
            case 12:
                C5554x it4 = (C5554x) obj;
                AbstractC16544l.m18094g(it4, "it");
                float f10 = AbstractC14982a.f46641a;
                interfaceC5985X.setValue(it4);
                return c17296c;
            case 13:
                String it5 = (String) obj;
                AbstractC16544l.m18094g(it5, "it");
                float f11 = AbstractC14993l.f46670a;
                interfaceC5985X.setValue(it5);
                return c17296c;
            case 14:
                ((InterfaceC1436k) interfaceC5985X.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return c17296c;
            case 15:
                return (Float) ((InterfaceC1436k) interfaceC5985X.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            case 16:
                EnumC13525q it6 = (EnumC13525q) obj;
                AbstractC16544l.m18094g(it6, "it");
                interfaceC5985X.setValue(Boolean.valueOf(it6.m15074a()));
                return c17296c;
            case 17:
                EnumC13525q it7 = (EnumC13525q) obj;
                AbstractC16544l.m18094g(it7, "it");
                interfaceC5985X.setValue(Boolean.valueOf(it7.m15074a()));
                return c17296c;
            case 18:
                Uri uri = (Uri) obj;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) interfaceC5985X.getValue();
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(new C19850A(uri));
                }
                return c17296c;
            case 19:
                List it8 = (List) obj;
                AbstractC16544l.m18094g(it8, "it");
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) interfaceC5985X.getValue();
                if (interfaceC1436k2 != null) {
                    interfaceC1436k2.invoke(new C19861L(it8));
                }
                return c17296c;
            case 20:
                Uri uri2 = (Uri) obj;
                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) interfaceC5985X.getValue();
                if (interfaceC1436k3 != null) {
                    interfaceC1436k3.invoke(new C19850A(uri2));
                }
                return c17296c;
            case 21:
                List it9 = (List) obj;
                AbstractC16544l.m18094g(it9, "it");
                InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) interfaceC5985X.getValue();
                if (interfaceC1436k4 != null) {
                    interfaceC1436k4.invoke(new C19861L(it9));
                }
                return c17296c;
            case 22:
                int i10 = (int) (((C7545j) obj).f23903a >> 32);
                Integer num = (Integer) interfaceC5985X.getValue();
                interfaceC5985X.setValue(i10 > (num != null ? num.intValue() : 0) ? Integer.valueOf(i10) : (Integer) interfaceC5985X.getValue());
                return c17296c;
            case 23:
                C4679f categoryAndModels = (C4679f) obj;
                AbstractC16544l.m18094g(categoryAndModels, "categoryAndModels");
                interfaceC5985X.setValue(categoryAndModels);
                return c17296c;
            case 24:
                EnumC13525q it10 = (EnumC13525q) obj;
                AbstractC16544l.m18094g(it10, "it");
                interfaceC5985X.setValue(Boolean.valueOf(it10.m15074a()));
                return c17296c;
            case 25:
                interfaceC5985X.setValue(new C7545j(((C7545j) obj).f23903a));
                return c17296c;
            case 26:
                C6045C value2 = (C6045C) obj;
                AbstractC16544l.m18094g(value2, "value");
                if (value2.f19682a.f10934Y.length() <= 128) {
                    interfaceC5985X.setValue(value2);
                }
                return c17296c;
            case 27:
                interfaceC5985X.setValue((String) obj);
                return c17296c;
            case 28:
                Set it11 = (Set) obj;
                AbstractC16544l.m18094g(it11, "it");
                interfaceC5985X.setValue(it11);
                return c17296c;
            default:
                String it12 = (String) obj;
                AbstractC16544l.m18094g(it12, "it");
                interfaceC5985X.setValue(it12);
                return c17296c;
        }
    }
}
