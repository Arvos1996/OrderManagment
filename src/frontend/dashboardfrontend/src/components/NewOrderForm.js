import React from 'react';
import {
    Form,
    Input,
    Button,
} from 'antd';
import TextArea from "antd/es/input/TextArea";

const formItemLayout = {
    labelCol: {
        xs: {span: 24},
        sm: {span: 8},
    },
    wrapperCol: {
        xs: {span: 24},
        sm: {span: 16},
    },
};
const tailFormItemLayout = {
    wrapperCol: {
        xs: {
            span: 24,
            offset: 0,
        },
        sm: {
            span: 16,
            offset: 8,
        },
    },
};

const onChange = e => {
    console.log(e);
};

const NewOrderForm = () => {
    const [form] = Form.useForm();

    const onFinish = (values: any) => {
        console.log('Received values of form: ', values);
    };

    return (
        <Form
            {...formItemLayout}
            form={form}
            name="register"
            onFinish={onFinish}
            scrollToFirstError
        >
            <Form.Item
                name="streetName"
                label="StreetName"
                rules={[
                    {
                        required: true,
                        message: 'Please input a StreetName!',
                    },
                ]}
            >
                <Input/>
            </Form.Item>
            <Form.Item
                name="cityName"
                label="CityName"
                rules={[
                    {
                        required: true,
                        message: 'Please input a CityName!',
                    },
                ]}
            >
                <Input/>
            </Form.Item>
            <Form.Item
                name="postalCode"
                label="PostalCode"
                rules={[
                    {
                        required: true,
                        message: 'Please enter valid PostalCode!',
                    },
                    ({getFieldValue}) => ({
                        validator(_) {
                            if (getFieldValue('postalCode').length === 5) {
                                return Promise.resolve();
                            }
                            return Promise.reject(new Error('Invalid PostalCode!'));
                        },
                    }),
                ]}
            >
                <Input style={{width: '25%'}}/>
            </Form.Item>
            <Form.Item {...tailFormItemLayout}>
                <TextArea placeholder="Additional Comment" allowClear onChange={onChange} />
            </Form.Item>
            <Form.Item {...tailFormItemLayout}>
                <Button type="primary" htmlType="submit">
                    Create
                </Button>
            </Form.Item>
        </Form>
    );
};

export default NewOrderForm;