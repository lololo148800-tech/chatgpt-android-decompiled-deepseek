package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p373P4.AbstractC6345a;
import p373P4.C6346b;
import p373P4.InterfaceC6347c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC6345a abstractC6345a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC6347c interfaceC6347cM6966g = remoteActionCompat.f32884a;
        if (abstractC6345a.mo6964e(1)) {
            interfaceC6347cM6966g = abstractC6345a.m6966g();
        }
        remoteActionCompat.f32884a = (IconCompat) interfaceC6347cM6966g;
        CharSequence charSequence = remoteActionCompat.f32885b;
        if (abstractC6345a.mo6964e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6346b) abstractC6345a).f20606e);
        }
        remoteActionCompat.f32885b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f32886c;
        if (abstractC6345a.mo6964e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6346b) abstractC6345a).f20606e);
        }
        remoteActionCompat.f32886c = charSequence2;
        remoteActionCompat.f32887d = (PendingIntent) abstractC6345a.m6965f(remoteActionCompat.f32887d, 4);
        boolean z6 = remoteActionCompat.f32888e;
        if (abstractC6345a.mo6964e(5)) {
            z6 = ((C6346b) abstractC6345a).f20606e.readInt() != 0;
        }
        remoteActionCompat.f32888e = z6;
        boolean z10 = remoteActionCompat.f32889f;
        if (abstractC6345a.mo6964e(6)) {
            z10 = ((C6346b) abstractC6345a).f20606e.readInt() != 0;
        }
        remoteActionCompat.f32889f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6345a abstractC6345a) {
        abstractC6345a.getClass();
        IconCompat iconCompat = remoteActionCompat.f32884a;
        abstractC6345a.mo6967h(1);
        abstractC6345a.m6968i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f32885b;
        abstractC6345a.mo6967h(2);
        Parcel parcel = ((C6346b) abstractC6345a).f20606e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f32886c;
        abstractC6345a.mo6967h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f32887d;
        abstractC6345a.mo6967h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z6 = remoteActionCompat.f32888e;
        abstractC6345a.mo6967h(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z10 = remoteActionCompat.f32889f;
        abstractC6345a.mo6967h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
