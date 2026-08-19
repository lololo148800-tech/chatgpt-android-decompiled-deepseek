package android.gov.nist.javax.sip.address;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.parser.URLParser;
import java.text.ParseException;
import java.util.regex.Pattern;
import p691d.InterfaceC12942a;
import p691d.InterfaceC12945d;
import p691d.InterfaceC12946e;
import p691d.InterfaceC12947f;

/* JADX INFO: loaded from: classes.dex */
public class AddressFactoryImpl implements AddressFactoryEx {
    public static final Pattern SCHEME_PATTERN = Pattern.compile("\\p{Alpha}[[{\\p{Alpha}][\\p{Digit}][\\+][-][\\.]]*");

    public InterfaceC12942a createAddress() {
        return new AddressImpl();
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12945d createSipURI(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null URI");
        }
        try {
            return new StringMsgParser().parseSIPUrl(str);
        } catch (ParseException e10) {
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12946e createTelURL(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null url");
        }
        if (!str.startsWith("tel:")) {
            str = "tel:".concat(str);
        }
        try {
            return (TelURLImpl) new StringMsgParser().parseUrl(str);
        } catch (ParseException e10) {
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12947f createURI(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        try {
            String strPeekScheme = new URLParser(str).peekScheme();
            if (strPeekScheme == null) {
                throw new ParseException("bad scheme", 0);
            }
            if (!strPeekScheme.equalsIgnoreCase("sip") && !strPeekScheme.equalsIgnoreCase("sips")) {
                if (strPeekScheme.equalsIgnoreCase("tel")) {
                    return createTelURL(str);
                }
                if (SCHEME_PATTERN.matcher(strPeekScheme).matches()) {
                    return new GenericURI(str);
                }
                throw new ParseException("the scheme " + strPeekScheme + " from the following uri " + str + " doesn't match ALPHA *(ALPHA / DIGIT / \"+\" / \"-\" / \".\" ) from RFC3261", 0);
            }
            return createSipURI(str);
        } catch (ParseException e10) {
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12942a createAddress(String str, InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f == null) {
            throw new NullPointerException("null  URI");
        }
        AddressImpl addressImpl = new AddressImpl();
        if (str != null) {
            addressImpl.setDisplayName(str);
        }
        addressImpl.setURI(interfaceC12947f);
        return addressImpl;
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12945d createSipURI(String str, String str2) throws ParseException {
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder("sip:");
            if (str != null) {
                sb2.append(str);
                sb2.append(Separators.f31989AT);
            }
            if (str2.indexOf(58) != str2.lastIndexOf(58) && str2.trim().charAt(0) != '[') {
                str2 = AbstractC10763a.m11047e(']', "[", str2);
            }
            sb2.append(str2);
            try {
                return createSipURI(sb2.toString());
            } catch (ParseException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new NullPointerException("null host");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12942a createAddress(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f != null) {
            AddressImpl addressImpl = new AddressImpl();
            addressImpl.setURI(interfaceC12947f);
            return addressImpl;
        }
        throw new NullPointerException("null address");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public InterfaceC12942a createAddress(String str) {
        if (str != null) {
            if (str.equals(Separators.STAR)) {
                AddressImpl addressImpl = new AddressImpl();
                addressImpl.setAddressType(3);
                SipUri sipUri = new SipUri();
                sipUri.setUser(Separators.STAR);
                addressImpl.setURI(sipUri);
                return addressImpl;
            }
            return new StringMsgParser().parseAddress(str);
        }
        throw new NullPointerException("null address");
    }
}
