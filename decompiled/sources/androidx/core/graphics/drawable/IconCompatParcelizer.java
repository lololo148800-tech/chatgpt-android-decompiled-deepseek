package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p373P4.AbstractC6345a;
import p373P4.C6346b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC6345a abstractC6345a) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f32891a;
        if (abstractC6345a.mo6964e(1)) {
            i10 = ((C6346b) abstractC6345a).f20606e.readInt();
        }
        iconCompat.f32891a = i10;
        byte[] bArr = iconCompat.f32893c;
        if (abstractC6345a.mo6964e(2)) {
            Parcel parcel = ((C6346b) abstractC6345a).f20606e;
            int i11 = parcel.readInt();
            if (i11 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i11];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f32893c = bArr;
        iconCompat.f32894d = abstractC6345a.m6965f(iconCompat.f32894d, 3);
        int i12 = iconCompat.f32895e;
        if (abstractC6345a.mo6964e(4)) {
            i12 = ((C6346b) abstractC6345a).f20606e.readInt();
        }
        iconCompat.f32895e = i12;
        int i13 = iconCompat.f32896f;
        if (abstractC6345a.mo6964e(5)) {
            i13 = ((C6346b) abstractC6345a).f20606e.readInt();
        }
        iconCompat.f32896f = i13;
        iconCompat.f32897g = (ColorStateList) abstractC6345a.m6965f(iconCompat.f32897g, 6);
        String string = iconCompat.f32899i;
        if (abstractC6345a.mo6964e(7)) {
            string = ((C6346b) abstractC6345a).f20606e.readString();
        }
        iconCompat.f32899i = string;
        String string2 = iconCompat.f32900j;
        if (abstractC6345a.mo6964e(8)) {
            string2 = ((C6346b) abstractC6345a).f20606e.readString();
        }
        iconCompat.f32900j = string2;
        iconCompat.f32898h = PorterDuff.Mode.valueOf(iconCompat.f32899i);
        switch (iconCompat.f32891a) {
            case -1:
                Parcelable parcelable = iconCompat.f32894d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f32892b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f32894d;
                if (parcelable2 != null) {
                    iconCompat.f32892b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f32893c;
                    iconCompat.f32892b = bArr3;
                    iconCompat.f32891a = 3;
                    iconCompat.f32895e = 0;
                    iconCompat.f32896f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f32893c, Charset.forName("UTF-16"));
                iconCompat.f32892b = str;
                if (iconCompat.f32891a == 2 && iconCompat.f32900j == null) {
                    iconCompat.f32900j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f32892b = iconCompat.f32893c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC6345a abstractC6345a) {
        abstractC6345a.getClass();
        iconCompat.f32899i = iconCompat.f32898h.name();
        switch (iconCompat.f32891a) {
            case -1:
                iconCompat.f32894d = (Parcelable) iconCompat.f32892b;
                break;
            case 1:
            case 5:
                iconCompat.f32894d = (Parcelable) iconCompat.f32892b;
                break;
            case 2:
                iconCompat.f32893c = ((String) iconCompat.f32892b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f32893c = (byte[]) iconCompat.f32892b;
                break;
            case 4:
            case 6:
                iconCompat.f32893c = iconCompat.f32892b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f32891a;
        if (-1 != i10) {
            abstractC6345a.mo6967h(1);
            ((C6346b) abstractC6345a).f20606e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f32893c;
        if (bArr != null) {
            abstractC6345a.mo6967h(2);
            int length = bArr.length;
            Parcel parcel = ((C6346b) abstractC6345a).f20606e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f32894d;
        if (parcelable != null) {
            abstractC6345a.mo6967h(3);
            ((C6346b) abstractC6345a).f20606e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f32895e;
        if (i11 != 0) {
            abstractC6345a.mo6967h(4);
            ((C6346b) abstractC6345a).f20606e.writeInt(i11);
        }
        int i12 = iconCompat.f32896f;
        if (i12 != 0) {
            abstractC6345a.mo6967h(5);
            ((C6346b) abstractC6345a).f20606e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f32897g;
        if (colorStateList != null) {
            abstractC6345a.mo6967h(6);
            ((C6346b) abstractC6345a).f20606e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f32899i;
        if (str != null) {
            abstractC6345a.mo6967h(7);
            ((C6346b) abstractC6345a).f20606e.writeString(str);
        }
        String str2 = iconCompat.f32900j;
        if (str2 != null) {
            abstractC6345a.mo6967h(8);
            ((C6346b) abstractC6345a).f20606e.writeString(str2);
        }
    }
}
