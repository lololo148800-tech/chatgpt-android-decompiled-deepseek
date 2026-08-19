package com.withpersona.sdk2.inquiry.p689ui.network;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationDataJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocationDataJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f41024a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f41025b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f41026c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f41027d;

    public LocationDataJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f41024a = C11475v.m12866a(ParameterNames.f31999ID, "address_street_1", "address_street_2", "address_city", "address_subdivision", "address_postal_code", "address_country_code", "address_business_name");
        C17691y c17691y = C17691y.f56482Y;
        this.f41025b = moshi.m12850b(String.class, c17691y, ParameterNames.f31999ID);
        this.f41026c = moshi.m12850b(String.class, c17691y, "addressStreet1");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.f41024a)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    str = (String) this.f41025b.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l(ParameterNames.f31999ID, ParameterNames.f31999ID, reader);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f41026c.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    str3 = (String) this.f41026c.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    str4 = (String) this.f41026c.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    str5 = (String) this.f41026c.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    str6 = (String) this.f41026c.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    str7 = (String) this.f41026c.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    str8 = (String) this.f41026c.fromJson(reader);
                    i10 &= -129;
                    break;
            }
        }
        reader.mo12818m();
        if (i10 == -255) {
            if (str != null) {
                return new LocationData(str, str2, str3, str4, str5, str6, str7, str8);
            }
            throw AbstractC13178c.m14832f(ParameterNames.f31999ID, ParameterNames.f31999ID, reader);
        }
        Constructor declaredConstructor = this.f41027d;
        if (declaredConstructor == null) {
            declaredConstructor = LocationData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.f41027d = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        if (str == null) {
            throw AbstractC13178c.m14832f(ParameterNames.f31999ID, ParameterNames.f31999ID, reader);
        }
        Object objNewInstance = declaredConstructor.newInstance(str, str2, str3, str4, str5, str6, str7, str8, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (LocationData) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        LocationData locationData = (LocationData) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (locationData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(ParameterNames.f31999ID);
        this.f41025b.toJson(writer, locationData.f41016a);
        writer.mo12827T("address_street_1");
        AbstractC11471r abstractC11471r = this.f41026c;
        abstractC11471r.toJson(writer, locationData.f41017b);
        writer.mo12827T("address_street_2");
        abstractC11471r.toJson(writer, locationData.f41018c);
        writer.mo12827T("address_city");
        abstractC11471r.toJson(writer, locationData.f41019d);
        writer.mo12827T("address_subdivision");
        abstractC11471r.toJson(writer, locationData.f41020e);
        writer.mo12827T("address_postal_code");
        abstractC11471r.toJson(writer, locationData.f41021f);
        writer.mo12827T("address_country_code");
        abstractC11471r.toJson(writer, locationData.f41022g);
        writer.mo12827T("address_business_name");
        abstractC11471r.toJson(writer, locationData.f41023h);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(34, "GeneratedJsonAdapter(LocationData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
